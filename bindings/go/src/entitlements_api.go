/* 
 * Cloudsmith API
 *
 * The API to the Cloudsmith Service
 *
 * OpenAPI spec version: v1
 * Contact: support@cloudsmith.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package cloudsmith_api

import (
	"net/url"
	"strings"
	"encoding/json"
	"fmt"
)

type EntitlementsApi struct {
	Configuration *Configuration
}

func NewEntitlementsApi() *EntitlementsApi {
	configuration := NewConfiguration()
	return &EntitlementsApi{
		Configuration: configuration,
	}
}

func NewEntitlementsApiWithBasePath(basePath string) *EntitlementsApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &EntitlementsApi{
		Configuration: configuration,
	}
}

/**
 * Create a specific entitlement in a repository.
 * Create a specific entitlement in a repository.
 *
 * @param owner 
 * @param repo 
 * @param data 
 * @return *RepositoryToken
 */
func (a EntitlementsApi) EntitlementsCreate(owner string, repo string, data EntitlementsCreate) (*RepositoryToken, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &data
	var successPayload = new(RepositoryToken)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsCreate", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Delete a specific entitlement in a repository.
 * Delete a specific entitlement in a repository.
 *
 * @param owner 
 * @param repo 
 * @param slugPerm 
 * @return void
 */
func (a EntitlementsApi) EntitlementsDelete(owner string, repo string, slugPerm string) (*APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Delete")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/{slug_perm}/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"slug_perm"+"}", fmt.Sprintf("%v", slugPerm), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsDelete", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

/**
 * Get a list of all entitlements in a repository.
 * Get a list of all entitlements in a repository.
 *
 * @param owner 
 * @param repo 
 * @param page A page number within the paginated result set.
 * @param pageSize Number of results to return per page.
 * @return []RepositoryToken
 */
func (a EntitlementsApi) EntitlementsList(owner string, repo string, page int32, pageSize int32) ([]RepositoryToken, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	localVarQueryParams.Add("page", a.Configuration.APIClient.ParameterToString(page, ""))
	localVarQueryParams.Add("page_size", a.Configuration.APIClient.ParameterToString(pageSize, ""))

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	var successPayload = new([]RepositoryToken)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsList", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return *successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return *successPayload, localVarAPIResponse, err
}

/**
 * Update a specific entitlement in a repository.
 * Update a specific entitlement in a repository.
 *
 * @param owner 
 * @param repo 
 * @param slugPerm 
 * @param data 
 * @return *RepositoryToken
 */
func (a EntitlementsApi) EntitlementsPartialUpdate(owner string, repo string, slugPerm string, data EntitlementsPartialUpdate) (*RepositoryToken, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Patch")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/{slug_perm}/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"slug_perm"+"}", fmt.Sprintf("%v", slugPerm), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &data
	var successPayload = new(RepositoryToken)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsPartialUpdate", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Views for working with repository entitlements.
 * Views for working with repository entitlements.
 *
 * @param owner 
 * @param repo 
 * @param slugPerm 
 * @return *RepositoryToken
 */
func (a EntitlementsApi) EntitlementsRead(owner string, repo string, slugPerm string) (*RepositoryToken, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/{slug_perm}/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"slug_perm"+"}", fmt.Sprintf("%v", slugPerm), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	var successPayload = new(RepositoryToken)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsRead", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Refresh an entitlement token in a repository.
 * Refresh an entitlement token in a repository.
 *
 * @param owner 
 * @param repo 
 * @param slugPerm 
 * @param data 
 * @return *RepositoryTokenRefresh
 */
func (a EntitlementsApi) EntitlementsRefresh(owner string, repo string, slugPerm string, data EntitlementsRefresh) (*RepositoryTokenRefresh, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/{slug_perm}/refresh/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"slug_perm"+"}", fmt.Sprintf("%v", slugPerm), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &data
	var successPayload = new(RepositoryTokenRefresh)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsRefresh", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Synchronise tokens from a source repository.
 * Synchronise tokens from a source repository.
 *
 * @param owner 
 * @param repo 
 * @param data 
 * @return *RepositoryTokenSync
 */
func (a EntitlementsApi) EntitlementsSync(owner string, repo string, data EntitlementsSync) (*RepositoryTokenSync, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/entitlements/{owner}/{repo}/sync/"
	localVarPath = strings.Replace(localVarPath, "{"+"owner"+"}", fmt.Sprintf("%v", owner), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"repo"+"}", fmt.Sprintf("%v", repo), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(apikey)' required
	// set key with prefix in header
	localVarHeaderParams["X-Api-Key"] = a.Configuration.GetAPIKeyWithPrefix("X-Api-Key")
	// authentication '(basic)' required
	// http basic authentication required
	if a.Configuration.Username != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// authentication '(csrf_token)' required
	// set key with prefix in header
	localVarHeaderParams["X-CSRFToken"] = a.Configuration.GetAPIKeyWithPrefix("X-CSRFToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &data
	var successPayload = new(RepositoryTokenSync)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "EntitlementsSync", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}
