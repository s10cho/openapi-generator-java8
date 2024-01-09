# UserResourceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET**](UserResourceApi.md#findAllUsingGET) | **GET** /users | findAll
[**findUsingGET**](UserResourceApi.md#findUsingGET) | **GET** /users/{id} | find

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> List&lt;User&gt; findAllUsingGET()

findAll

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserResourceApi;


UserResourceApi apiInstance = new UserResourceApi();
try {
    List<User> result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserResourceApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findUsingGET"></a>
# **findUsingGET**
> User findUsingGET(id)

find

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserResourceApi;


UserResourceApi apiInstance = new UserResourceApi();
String id = "id_example"; // String | id
try {
    User result = apiInstance.findUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserResourceApi#findUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

