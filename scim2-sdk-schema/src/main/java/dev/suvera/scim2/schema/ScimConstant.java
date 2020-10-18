package dev.suvera.scim2.schema;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * author: suvera
 * date: 10/16/2020 11:03 PM
 */
public class ScimConstant {
    public static final String URN_LIST_RESPONSE = "urn:ietf:params:scim:api:messages:2.0:ListResponse";

    public static final String URN_RESOURCE_TYPE = "urn:ietf:params:scim:schemas:core:2.0:ResourceType";
    public static final String URN_SP_CONFIG = "urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig";
    public static final String URN_SCHEMA = "urn:ietf:params:scim:schemas:core:2.0:Schema";

    public static final String URN_USER = "urn:ietf:params:scim:schemas:core:2.0:User";
    public static final String URN_GROUP = "urn:ietf:params:scim:schemas:core:2.0:Group";

    public static final String URN_SEARCH_REQUEST = "urn:ietf:params:scim:api:messages:2.0:SearchRequest";
    public static final String URN_PATCH_OP = "urn:ietf:params:scim:api:messages:2.0:PatchOp";

    public static final String URN_BULK_REQUEST = "urn:ietf:params:scim:api:messages:2.0:BulkRequest";
    public static final String URN_BULK_RESPONSE = "urn:ietf:params:scim:api:messages:2.0:BulkResponse";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final Set<String> SCIM_CONTENT_TYPES
            = ImmutableSet.of("application/scim+json", "application/json");

    public static final Set<String> SCIM_DEFAULT_SCHEMAS = ImmutableSet.of(
            URN_SP_CONFIG,
            URN_RESOURCE_TYPE,
            URN_SCHEMA,
            URN_USER,
            URN_GROUP
    );

    public static final String CLIENT_NAME = "SuVeRa SCIM 2.0 Client 1.0.0";


    public static final String PATH_BULK = "/bulk";
    public static final String PATH_SP = "/ServiceProviderConfig";
    public static final String PATH_RESOURCETYPES = "/ResourceTypes";
    public static final String PATH_SCHEMAS = "/Schemas";
    public static final String PATH_SEARCH = ".search";
}
