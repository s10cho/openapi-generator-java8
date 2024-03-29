/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserResourceApi
 */
@Ignore
public class UserResourceApiTest {

    private final UserResourceApi api = new UserResourceApi();

    /**
     * findAll
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsingGETTest() {
        List<User> response = api.findAllUsingGET();

        // TODO: test validations
    }
    /**
     * find
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findUsingGETTest() {
        String id = null;
        User response = api.findUsingGET(id);

        // TODO: test validations
    }
}
