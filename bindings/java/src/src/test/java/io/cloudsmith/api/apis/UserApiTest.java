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
import io.cloudsmith.api.models.UserAuthToken;
import io.cloudsmith.api.models.UserBrief;
import io.cloudsmith.api.models.UserTokenCreate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Provide a brief for the current user (if any).
     *
     * Provide a brief for the current user (if any).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userSelfTest() throws ApiException {
        UserBrief response = api.userSelf();

        // TODO: test validations
    }
    
    /**
     * Retrieve the API key/token for the authenticated user.
     *
     * Retrieve the API key/token for the authenticated user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userTokenCreateTest() throws ApiException {
        UserTokenCreate data = null;
        UserAuthToken response = api.userTokenCreate(data);

        // TODO: test validations
    }
    
}