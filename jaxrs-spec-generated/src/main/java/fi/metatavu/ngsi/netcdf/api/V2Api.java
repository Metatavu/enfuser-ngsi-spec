package fi.metatavu.ngsi.netcdf.api;

import fi.metatavu.ngsi.netcdf.api.model.CreateEntityRequest;
import fi.metatavu.ngsi.netcdf.api.model.CreateRegistrationRequest;
import fi.metatavu.ngsi.netcdf.api.model.CreateSubscriptionRequest;
import fi.metatavu.ngsi.netcdf.api.model.GetAttributeDataResponse;
import fi.metatavu.ngsi.netcdf.api.model.GetAttributeValueResponse;
import fi.metatavu.ngsi.netcdf.api.model.ListEntitiesResponse;
import fi.metatavu.ngsi.netcdf.api.model.ListEntityTypesResponse;
import fi.metatavu.ngsi.netcdf.api.model.ListRegistrationsResponse;
import fi.metatavu.ngsi.netcdf.api.model.ListSubscriptionsResponse;
import fi.metatavu.ngsi.netcdf.api.model.NotifyRequest;
import fi.metatavu.ngsi.netcdf.api.model.QueryRequest;
import fi.metatavu.ngsi.netcdf.api.model.QueryResponse;
import fi.metatavu.ngsi.netcdf.api.model.ReplaceAllEntityAttributesRequest;
import fi.metatavu.ngsi.netcdf.api.model.RetrieveApiResourcesResponse;
import fi.metatavu.ngsi.netcdf.api.model.RetrieveEntityAttributesResponse;
import fi.metatavu.ngsi.netcdf.api.model.RetrieveEntityResponse;
import fi.metatavu.ngsi.netcdf.api.model.RetrieveEntityTypeResponse;
import fi.metatavu.ngsi.netcdf.api.model.RetrieveRegistrationResponse;
import fi.metatavu.ngsi.netcdf.api.model.UpdateAttributeDataRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateAttributeValueRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateExistingEntityAttributesRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateOrAppendEntityAttributesRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateRegistrationRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateRequest;
import fi.metatavu.ngsi.netcdf.api.model.UpdateSubscriptionRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/v2")

@Api(description = "the v2 API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-10-23T09:59:38.392+03:00")


public interface V2Api  {

    @POST
    @Path("/entities")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Entity", notes = "The payload is an object representing the entity to be created. The object follows the JSON entity representation format (described in a \"JSON Entity Representation\" section). Response: * Successful operation uses 201 Created (if upsert option is not used) or 204 No Content (if   upsert option is used). Response includes a `Location` header with the URL of the   created entity. * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response createEntity(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid CreateEntityRequest body,  @QueryParam("options") String options) throws Exception;

    @POST
    @Path("/registrations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Registration", notes = "Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Registrations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Void.class) })
    public Response createRegistration(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid CreateRegistrationRequest body) throws Exception;

    @POST
    @Path("/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Subscription", notes = "Creates a new subscription. The subscription is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Subscriptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Void.class) })
    public Response createSubscription(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid CreateSubscriptionRequest body) throws Exception;

    @DELETE
    @Path("/registrations/{registrationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Registration", notes = "Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Registrations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response deleteRegistration(@PathParam("registrationId") @ApiParam("registration Id.") String registrationId) throws Exception;

    @DELETE
    @Path("/subscriptions/{subscriptionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete subscription", notes = "Cancels subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Subscriptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response deleteSubscription(@PathParam("subscriptionId") @ApiParam("subscription Id.") String subscriptionId) throws Exception;

    @GET
    @Path("/entities/{entityId}/attrs/{attrName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get attribute data", notes = "Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \"JSON Attribute Representation\" section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = GetAttributeDataResponse.class, tags={ "Attributes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GetAttributeDataResponse.class) })
    public Response getAttributeData(@PathParam("entityId") @ApiParam("Id of the entity") String entityId,@PathParam("attrName") @ApiParam("Name of the attribute to be retrieved.") String attrName,  @QueryParam("type") String type,  @QueryParam("metadata") String metadata) throws Exception;

    @GET
    @Path("/entities/{entityId}/attrs/{attrName}/value")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Attribute Value", notes = "This operation returns the `value` property with the value of the attribute. * If attribute value is JSON Array or Object:   * If `Accept` header can be expanded to `application/json` or `text/plain` return the value as a JSON with a     response type of application/json or text/plain (whichever is the first in `Accept` header or     `application/json` in case of `Accept: *_/_*`).   * Else return a HTTP error \"406 Not Acceptable: accepted MIME types: application/json, text/plain\" * If attribute value is a string, number, null or boolean:   * If `Accept` header can be expanded to text/plain return the value as text. In case of a string, citation     marks are used at the begining and end.   * Else return a HTTP error \"406 Not Acceptable: accepted MIME types: text/plain\" Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = GetAttributeValueResponse.class, tags={ "Attribute Value",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GetAttributeValueResponse.class) })
    public Response getAttributeValue(@PathParam("entityId") @ApiParam("Id of the entity in question") String entityId,@PathParam("attrName") @ApiParam("Name of the attribute to be retrieved.") String attrName,  @QueryParam("type") String type) throws Exception;

    @GET
    @Path("/entities")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List Entities", notes = "Retrieves a list of entities that match different criteria by id, type, pattern matching (either id or type) and/or those which match a query or geographical query (see [Simple Query Language](#simple_query_language) and  [Geographical Queries](#geographical_queries)). A given entity has to match all the criteria to be retrieved (i.e., the criteria is combined in a logical AND way). Note that pattern matching query parameters are incompatible (i.e. mutually exclusive) with their corresponding exact matching parameters, i.e. `idPattern` with `id` and `typePattern` with `type`. The response payload is an array containing one object per matching entity. Each entity follows the JSON entity representation format (described in \"JSON Entity Representation\" section). Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = ListEntitiesResponse.class, responseContainer = "List", tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ListEntitiesResponse.class, responseContainer = "List") })
    public Response listEntities(  @QueryParam("id") String id,  @QueryParam("type") String type,  @QueryParam("idPattern") String idPattern,  @QueryParam("typePattern") String typePattern,  @QueryParam("q") String q,  @QueryParam("mq") String mq,  @QueryParam("georel") String georel,  @QueryParam("geometry") String geometry,  @QueryParam("coords") String coords,  @QueryParam("limit") Double limit,  @QueryParam("offset") Double offset,  @QueryParam("attrs") String attrs,  @QueryParam("metadata") String metadata,  @QueryParam("orderBy") String orderBy,  @QueryParam("options") String options) throws Exception;

    @GET
    @Path("/types/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List Entity Types", notes = "If the `values` option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * `type` : the entity type name. * `attrs` : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * `count` : the number of entities belonging to that type. If the `values` option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity `type` in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = ListEntityTypesResponse.class, responseContainer = "List", tags={ "Types",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ListEntityTypesResponse.class, responseContainer = "List") })
    public Response listEntityTypes(  @QueryParam("limit") Double limit,  @QueryParam("offset") Double offset,  @QueryParam("options") String options) throws Exception;

    @GET
    @Path("/registrations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List Registrations", notes = "Lists all the context provider registrations present in the system.", response = ListRegistrationsResponse.class, responseContainer = "List", tags={ "Registrations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ListRegistrationsResponse.class, responseContainer = "List") })
    public Response listRegistrations(  @QueryParam("limit") Double limit,  @QueryParam("offset") Double offset,  @QueryParam("options") String options) throws Exception;

    @GET
    @Path("/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List Subscriptions", notes = "Returns a list of all the subscriptions present in the system. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = ListSubscriptionsResponse.class, responseContainer = "List", tags={ "Subscriptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ListSubscriptionsResponse.class, responseContainer = "List") })
    public Response listSubscriptions(  @QueryParam("limit") Double limit,  @QueryParam("offset") Double offset,  @QueryParam("options") String options) throws Exception;

    @POST
    @Path("/op/notify")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Notify", notes = "This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as `POST /v2/op/update` with `actionType` equal to `append`. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Batch Operations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Void.class) })
    public Response notify(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid NotifyRequest body,  @QueryParam("options") String options) throws Exception;

    @POST
    @Path("/op/query")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Query", notes = "The response payload is an Array containing one object per matching entity, or an empty array `[]` if  no entities are found. The entities follow the JSON entity representation format (described in the section \"JSON Entity Representation\"). The payload may contain the following elements (all of them optional): + `entities`: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + `id` or `idPattern`: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + `type` or `typePattern`: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \"any entity type\". + `attrs`: List of attributes to be provided (if not specified, all attributes). + `expression`: an expression composed of `q`, `mq`, `georel`, `geometry` and `coords` (see \"List    entities\" operation above about this field). + `metadata`: a list of metadata names to include in the response.    See \"Filtering out attributes and metadata\" section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = QueryResponse.class, responseContainer = "List", tags={ "Batch Operations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = QueryResponse.class, responseContainer = "List") })
    public Response query(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid QueryRequest body,  @QueryParam("limit") Double limit,  @QueryParam("offset") Double offset,  @QueryParam("orderBy") String orderBy,  @QueryParam("options") String options) throws Exception;

    @DELETE
    @Path("/entities/{entityId}/attrs/{attrName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a Single Attribute", notes = "Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Attributes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response removeASingleAttribute(@PathParam("entityId") @ApiParam("Id of the entity.") String entityId,@PathParam("attrName") @ApiParam("Attribute name.") String attrName,  @QueryParam("type") String type) throws Exception;

    @DELETE
    @Path("/entities/{entityId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove Entity", notes = "Delete the entity. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response removeEntity(@PathParam("entityId") @ApiParam("Id of the entity to be deleted") String entityId,  @QueryParam("type") String type) throws Exception;

    @PUT
    @Path("/entities/{entityId}/attrs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Replace all entity attributes", notes = "The request payload is an object representing the new entity attributes. The object follows the JSON entity representation format (described in a \"JSON Entity Representation\" above), except that `id` and `type` are not allowed. The attributes previously existing in the entity are removed and replaced by the ones in the request. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response replaceAllEntityAttributes(@PathParam("entityId") @ApiParam("Id of the entity in question.") String entityId,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid ReplaceAllEntityAttributesRequest body,  @QueryParam("type") String type,  @QueryParam("options") String options) throws Exception;

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve API Resources", notes = "This resource does not have any attributes. Instead it offers the initial API affordances in the form of the links in the JSON body. It is recommended to follow the “url” link values, [Link](https://tools.ietf.org/html/rfc5988) or Location headers where applicable to retrieve resources. Instead of constructing your own URLs, to keep your client decoupled from implementation details.", response = RetrieveApiResourcesResponse.class, tags={ "API Entry Point",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RetrieveApiResourcesResponse.class) })
    public Response retrieveAPIResources() throws Exception;

    @GET
    @Path("/entities/{entityId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Entity", notes = "The response is an object representing the entity identified by the ID. The object follows the JSON entity representation format (described in \"JSON Entity Representation\" section). This operation must return one entity element only, but there may be more than one entity with the same ID (e.g. entities with same ID but different types). In such case, an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for more details.", response = RetrieveEntityResponse.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RetrieveEntityResponse.class) })
    public Response retrieveEntity(@PathParam("entityId") @ApiParam("Id of the entity to be retrieved") String entityId,  @QueryParam("type") String type,  @QueryParam("attrs") String attrs,  @QueryParam("metadata") String metadata,  @QueryParam("options") String options) throws Exception;

    @GET
    @Path("/entities/{entityId}/attrs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Entity Attributes", notes = "This request is similar to retreiving the whole entity, however this one omits the `id` and `type` fields. Just like the general request of getting an entire entity, this operation must return only one entity element. If more than one entity with the same ID is found (e.g. entities with same ID but different type), an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = RetrieveEntityAttributesResponse.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RetrieveEntityAttributesResponse.class) })
    public Response retrieveEntityAttributes(@PathParam("entityId") @ApiParam("Id of the entity to be retrieved") String entityId,  @QueryParam("type") String type,  @QueryParam("attrs") String attrs,  @QueryParam("metadata") String metadata,  @QueryParam("options") String options) throws Exception;

    @GET
    @Path("/types/{entityType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve entity type", notes = "This operation returns a JSON object with information about the type: * `attrs` : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * `count` : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = RetrieveEntityTypeResponse.class, tags={ "Types",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RetrieveEntityTypeResponse.class) })
    public Response retrieveEntityType(@PathParam("entityType") @ApiParam("Entity Type") String entityType) throws Exception;

    @GET
    @Path("/registrations/{registrationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Registration", notes = "The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = RetrieveRegistrationResponse.class, tags={ "Registrations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RetrieveRegistrationResponse.class) })
    public Response retrieveRegistration(@PathParam("registrationId") @ApiParam("registration Id.") String registrationId) throws Exception;

    @GET
    @Path("/subscriptions/{subscriptionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Subscription", notes = "The response is the subscription represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Object.class, tags={ "Subscriptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response retrieveSubscription(@PathParam("subscriptionId") @ApiParam("subscription Id.") String subscriptionId) throws Exception;

    @POST
    @Path("/op/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update", notes = "This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + `actionType`, to specify the kind of update action to do: either `append`, `appendStrict`, `update`,   `delete`, or `replace`. + `entities`, an array of entities, each entity specified using the JSON entity representation format   (described in the section \"JSON Entity Representation\"). This operation is split in as many individual operations as entities in the `entities` vector, so the `actionType` is executed for each one of them. Depending on the `actionType`, a mapping with regular non-batch operations can be done: * `append`: maps to `POST /v2/entities` (if the entity does not already exist) or `POST /v2/entities/<id>/attrs`   (if the entity already exists). * `appendStrict`: maps to `POST /v2/entities` (if the entity does not already exist) or   `POST /v2/entities/<id>/attrs?options=append` (if the entity already exists). * `update`: maps to `PATCH /v2/entities/<id>/attrs`. * `delete`: maps to `DELETE /v2/entities/<id>/attrs/<attrName>` on every attribute included in the entity or   to `DELETE /v2/entities/<id>` if no attribute were included in the entity. * `replace`: maps to `PUT /v2/entities/<id>/attrs`. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Batch Operations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response update(@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateRequest body,  @QueryParam("options") String options) throws Exception;

    @PUT
    @Path("/entities/{entityId}/attrs/{attrName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Attribute Data", notes = "The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \"JSON Attribute Representation\" section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Attributes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Void.class) })
    public Response updateAttributeData(@PathParam("entityId") @ApiParam("Id of the entity to update") String entityId,@PathParam("attrName") @ApiParam("Attribute name") String attrName,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateAttributeDataRequest body,  @QueryParam("type") String type) throws Exception;

    @PUT
    @Path("/entities/{entityId}/attrs/{attrName}/value")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Attribute Value", notes = "The request payload is the new attribute value. * If the request payload MIME type is `application/json`, then the value of the attribute is set to   the JSON object or array coded in the payload (if the payload is not a valid JSON document,   then an error is returned). * If the request payload MIME type is `text/plain`, then the following algorithm is applied to the   payload:   * If the payload starts and ends with citation-marks (`\"`), the value is taken as a string     (the citation marks themselves are not considered part of the string)   * If `true` or `false`, the value is taken as a boolean.   * If `null`, the value is taken as null.   * If these first three tests 'fail', the text is interpreted as a number.   * If not a valid number, then an error is returned and the attribute's value is unchanged. The payload MIME type in the request is specified in the `Content-Type` HTTP header. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Attribute Value",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Void.class) })
    public Response updateAttributeValue(@PathParam("entityId") @ApiParam("Id of the entity to be updated.") String entityId,@PathParam("attrName") @ApiParam("Attribute name.") String attrName,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateAttributeValueRequest body,  @QueryParam("type") String type) throws Exception;

    @PATCH
    @Path("/entities/{entityId}/attrs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Existing Entity Attributes", notes = "The request payload is an object representing the attributes to update. The object follows the JSON entity representation format (described in \"JSON Entity Representation\" section), except that `id` and `type` are not allowed. The entity attributes are updated with the ones in the payload. In addition to that, if one or more attributes in the payload doesn't exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response updateExistingEntityAttributes(@PathParam("entityId") @ApiParam("Id of the entity to be updated") String entityId,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateExistingEntityAttributesRequest body,  @QueryParam("type") String type,  @QueryParam("options") String options) throws Exception;

    @POST
    @Path("/entities/{entityId}/attrs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update or Append Entity Attributes", notes = "The request payload is an object representing the attributes to append or update. The object follows the JSON entity representation format (described in \"JSON Entity Representation\" section), except that `id` and `type` are not allowed. The entity attributes are updated with the ones in the payload, depending on whether the `append` operation option is used or not. * If `append` is not used: the entity attributes are updated (if they previously exist) or appended   (if they don't previously exist) with the ones in the payload. * If `append` is used (i.e. strict append semantics): all the attributes in the payload not   previously existing in the entity are appended. In addition to that, in case some of the   attributes in the payload already exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Entities",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response updateOrAppendEntityAttributes(@PathParam("entityId") @ApiParam("Entity id to be updated") String entityId,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateOrAppendEntityAttributesRequest body,  @QueryParam("type") String type,  @QueryParam("options") String options) throws Exception;

    @PATCH
    @Path("/registrations/{registrationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Registration", notes = "Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Registrations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response updateRegistration(@PathParam("registrationId") @ApiParam("registration Id.") String registrationId,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateRegistrationRequest body) throws Exception;

    @PATCH
    @Path("/subscriptions/{subscriptionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Subscription", notes = "Only the fields included in the request are updated in the subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \"Error Responses\" for   more details.", response = Void.class, tags={ "Subscriptions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    public Response updateSubscription(@PathParam("subscriptionId") @ApiParam("subscription Id.") String subscriptionId,@HeaderParam("Content-Type") @NotNull   @ApiParam("") String contentType,@Valid UpdateSubscriptionRequest body) throws Exception;
}
