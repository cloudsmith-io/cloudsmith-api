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

import io.cloudsmith.api.ApiCallback;
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.ApiResponse;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.Pair;
import io.cloudsmith.api.ProgressRequestBody;
import io.cloudsmith.api.ProgressResponseBody;
import io.cloudsmith.api.BeanValidationException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import javax.validation.constraints.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;
import java.util.Set;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import io.cloudsmith.api.models.Repository;
import io.cloudsmith.api.models.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReposApi {
    private ApiClient apiClient;

    public ReposApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReposApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for reposList
     * @param owner  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reposListCall(String owner, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey", "basic", "csrf_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call reposListValidateBeforeCall(String owner, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { owner, page, pageSize };
            Method method = this.getClass().getMethod("reposListWithHttpInfo", String.class, Integer.class, Integer.class);
            Set<ConstraintViolation<ReposApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = reposListCall(owner, page, pageSize, progressListener, progressRequestListener);
                return call;
            
            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * Get a list of all repositories within a namespace.
     * Get a list of all repositories within a namespace.
     * @param owner  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return List&lt;Repository&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Repository> reposList(String owner, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<List<Repository>> resp = reposListWithHttpInfo(owner, page, pageSize);
        return resp.getData();
    }

    /**
     * Get a list of all repositories within a namespace.
     * Get a list of all repositories within a namespace.
     * @param owner  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return ApiResponse&lt;List&lt;Repository&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Repository>> reposListWithHttpInfo( @NotNull String owner,  Integer page,  Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = reposListValidateBeforeCall(owner, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<Repository>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of all repositories within a namespace. (asynchronously)
     * Get a list of all repositories within a namespace.
     * @param owner  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reposListAsync(String owner, Integer page, Integer pageSize, final ApiCallback<List<Repository>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = reposListValidateBeforeCall(owner, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Repository>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for reposRead
     * @param owner  (required)
     * @param slug  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reposReadCall(String owner, String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{slug}/"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "slug" + "\\}", apiClient.escapeString(slug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey", "basic", "csrf_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call reposReadValidateBeforeCall(String owner, String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { owner, slug };
            Method method = this.getClass().getMethod("reposReadWithHttpInfo", String.class, String.class);
            Set<ConstraintViolation<ReposApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = reposReadCall(owner, slug, progressListener, progressRequestListener);
                return call;
            
            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * Views for working with repositories.
     * Views for working with repositories.
     * @param owner  (required)
     * @param slug  (required)
     * @return Repository
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Repository reposRead(String owner, String slug) throws ApiException {
        ApiResponse<Repository> resp = reposReadWithHttpInfo(owner, slug);
        return resp.getData();
    }

    /**
     * Views for working with repositories.
     * Views for working with repositories.
     * @param owner  (required)
     * @param slug  (required)
     * @return ApiResponse&lt;Repository&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Repository> reposReadWithHttpInfo( @NotNull String owner,  @NotNull String slug) throws ApiException {
        com.squareup.okhttp.Call call = reposReadValidateBeforeCall(owner, slug, null, null);
        Type localVarReturnType = new TypeToken<Repository>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Views for working with repositories. (asynchronously)
     * Views for working with repositories.
     * @param owner  (required)
     * @param slug  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reposReadAsync(String owner, String slug, final ApiCallback<Repository> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = reposReadValidateBeforeCall(owner, slug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Repository>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}