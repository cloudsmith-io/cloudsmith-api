/*
 * Cloudsmith API
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

import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.models.Status;
import io.cloudsmith.api.models.VulnerabilityScanResults;
import io.cloudsmith.api.models.VulnerabilityScanResultsList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VulnerabilitiesApi
 */
@Ignore
public class VulnerabilitiesApiTest {

    private final VulnerabilitiesApi api = new VulnerabilitiesApi();

    
    /**
     * Checks feature is within plan before listing results.
     *
     * Checks feature is within plan before listing results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vulnerabilitiesListTest() throws ApiException {
        String owner = null;
        Integer page = null;
        Integer pageSize = null;
        List<VulnerabilityScanResultsList> response = api.vulnerabilitiesList(owner, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Checks feature is within plan before listing results.
     *
     * Checks feature is within plan before listing results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vulnerabilitiesList0Test() throws ApiException {
        String owner = null;
        String repo = null;
        Integer page = null;
        Integer pageSize = null;
        List<VulnerabilityScanResultsList> response = api.vulnerabilitiesList0(owner, repo, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Checks feature is within plan before listing results.
     *
     * Checks feature is within plan before listing results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vulnerabilitiesList1Test() throws ApiException {
        String owner = null;
        String repo = null;
        String _package = null;
        Integer page = null;
        Integer pageSize = null;
        List<VulnerabilityScanResultsList> response = api.vulnerabilitiesList1(owner, repo, _package, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Checks feature is within plan before retrieving results.
     *
     * Checks feature is within plan before retrieving results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vulnerabilitiesReadTest() throws ApiException {
        String owner = null;
        String repo = null;
        String _package = null;
        String scanId = null;
        VulnerabilityScanResults response = api.vulnerabilitiesRead(owner, repo, _package, scanId);

        // TODO: test validations
    }
    
}