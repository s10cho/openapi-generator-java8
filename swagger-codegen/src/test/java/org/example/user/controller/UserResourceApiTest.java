package org.example.user.controller;

import java.util.List;

import io.swagger.client.ApiClient;
import io.swagger.client.api.UserResourceApi;
import io.swagger.client.model.User;
import org.junit.jupiter.api.Test;

class UserResourceApiTest {

    @Test
    void userApiTest() {
        ApiClient apiClient = new ApiClient().setBasePath("http://localhost:8080");
        UserResourceApi userResourceApi = new UserResourceApi(apiClient);
        List<User> list = userResourceApi.findAllUsingGET();
        System.out.println(list.size());
    }
}
