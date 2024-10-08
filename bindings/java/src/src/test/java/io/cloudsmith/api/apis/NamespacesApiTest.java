/*
 * Cloudsmith API (v1)
 * The API to the Cloudsmith Service
 *
 * OpenAPI spec version: v1
 * Contact: support@cloudsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.cloudsmith.api.apis;

import io.cloudsmith.api.models.ErrorDetail;
import io.cloudsmith.api.models.Namespace;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NamespacesApi
 */
@Ignore
public class NamespacesApiTest {

    private final NamespacesApi api = new NamespacesApi();

    
    /**
     * Get a list of all namespaces the user belongs to.
     *
     * Get a list of all namespaces the user belongs to.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void namespacesListTest() throws Exception {
        java.math.BigInteger page = null;
        java.math.BigInteger pageSize = null;
        List<Namespace> response = api.namespacesList(page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific namespace that the user belongs to.
     *
     * Get a specific namespace that the user belongs to.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void namespacesReadTest() throws Exception {
        String slug = null;
        Namespace response = api.namespacesRead(slug);

        // TODO: test validations
    }
    
}
