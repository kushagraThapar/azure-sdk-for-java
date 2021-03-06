/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceErrorException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MaintenanceConfigurations.
 */
public class MaintenanceConfigurationsInner implements InnerSupportsGet<MaintenanceConfigurationInner>, InnerSupportsDelete<MaintenanceConfigurationInner> {
    /** The Retrofit service to perform REST calls. */
    private MaintenanceConfigurationsService service;
    /** The service client containing this operation class. */
    private MaintenanceManagementClientImpl client;

    /**
     * Initializes an instance of MaintenanceConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MaintenanceConfigurationsInner(Retrofit retrofit, MaintenanceManagementClientImpl client) {
        this.service = retrofit.create(MaintenanceConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MaintenanceConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MaintenanceConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/maintenanceConfigurations/{resourceName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/maintenanceConfigurations/{resourceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Body MaintenanceConfigurationInner configuration, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/maintenanceConfigurations/{resourceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations updateMethod" })
        @PATCH("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/maintenanceConfigurations/{resourceName}")
        Observable<Response<ResponseBody>> updateMethod(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Body MaintenanceConfigurationInner configuration, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Maintenance/maintenanceConfigurations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws MaintenanceErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MaintenanceConfigurationInner object if successful.
     */
    public MaintenanceConfigurationInner getByResourceGroup(String resourceGroupName, String resourceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Get Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MaintenanceConfigurationInner> getByResourceGroupAsync(String resourceGroupName, String resourceName, final ServiceCallback<MaintenanceConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Get Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<MaintenanceConfigurationInner> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<MaintenanceConfigurationInner>, MaintenanceConfigurationInner>() {
            @Override
            public MaintenanceConfigurationInner call(ServiceResponse<MaintenanceConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<ServiceResponse<MaintenanceConfigurationInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MaintenanceConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<MaintenanceConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MaintenanceConfigurationInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MaintenanceConfigurationInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws MaintenanceErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MaintenanceConfigurationInner, MaintenanceErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MaintenanceConfigurationInner>() { }.getType())
                .registerError(MaintenanceErrorException.class)
                .build(response);
    }

    /**
     * Create or Update configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws MaintenanceErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MaintenanceConfigurationInner object if successful.
     */
    public MaintenanceConfigurationInner createOrUpdate(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, configuration).toBlocking().single().body();
    }

    /**
     * Create or Update configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MaintenanceConfigurationInner> createOrUpdateAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration, final ServiceCallback<MaintenanceConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, configuration), serviceCallback);
    }

    /**
     * Create or Update configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<MaintenanceConfigurationInner> createOrUpdateAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, configuration).map(new Func1<ServiceResponse<MaintenanceConfigurationInner>, MaintenanceConfigurationInner>() {
            @Override
            public MaintenanceConfigurationInner call(ServiceResponse<MaintenanceConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or Update configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<ServiceResponse<MaintenanceConfigurationInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (configuration == null) {
            throw new IllegalArgumentException("Parameter configuration is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(configuration);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, resourceName, configuration, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MaintenanceConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<MaintenanceConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MaintenanceConfigurationInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MaintenanceConfigurationInner> createOrUpdateDelegate(Response<ResponseBody> response) throws MaintenanceErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MaintenanceConfigurationInner, MaintenanceErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MaintenanceConfigurationInner>() { }.getType())
                .registerError(MaintenanceErrorException.class)
                .build(response);
    }

    /**
     * Delete Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws MaintenanceErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MaintenanceConfigurationInner object if successful.
     */
    public MaintenanceConfigurationInner delete(String resourceGroupName, String resourceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Delete Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MaintenanceConfigurationInner> deleteAsync(String resourceGroupName, String resourceName, final ServiceCallback<MaintenanceConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Delete Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<MaintenanceConfigurationInner> deleteAsync(String resourceGroupName, String resourceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<MaintenanceConfigurationInner>, MaintenanceConfigurationInner>() {
            @Override
            public MaintenanceConfigurationInner call(ServiceResponse<MaintenanceConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete Configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<ServiceResponse<MaintenanceConfigurationInner>> deleteWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MaintenanceConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<MaintenanceConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MaintenanceConfigurationInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MaintenanceConfigurationInner> deleteDelegate(Response<ResponseBody> response) throws MaintenanceErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MaintenanceConfigurationInner, MaintenanceErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MaintenanceConfigurationInner>() { }.getType())
                .registerError(MaintenanceErrorException.class)
                .build(response);
    }

    /**
     * Patch configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws MaintenanceErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MaintenanceConfigurationInner object if successful.
     */
    public MaintenanceConfigurationInner updateMethod(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        return updateMethodWithServiceResponseAsync(resourceGroupName, resourceName, configuration).toBlocking().single().body();
    }

    /**
     * Patch configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MaintenanceConfigurationInner> updateMethodAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration, final ServiceCallback<MaintenanceConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateMethodWithServiceResponseAsync(resourceGroupName, resourceName, configuration), serviceCallback);
    }

    /**
     * Patch configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<MaintenanceConfigurationInner> updateMethodAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        return updateMethodWithServiceResponseAsync(resourceGroupName, resourceName, configuration).map(new Func1<ServiceResponse<MaintenanceConfigurationInner>, MaintenanceConfigurationInner>() {
            @Override
            public MaintenanceConfigurationInner call(ServiceResponse<MaintenanceConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Patch configuration record.
     *
     * @param resourceGroupName Resource Group Name
     * @param resourceName Resource Identifier
     * @param configuration The configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceConfigurationInner object
     */
    public Observable<ServiceResponse<MaintenanceConfigurationInner>> updateMethodWithServiceResponseAsync(String resourceGroupName, String resourceName, MaintenanceConfigurationInner configuration) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (configuration == null) {
            throw new IllegalArgumentException("Parameter configuration is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(configuration);
        return service.updateMethod(this.client.subscriptionId(), resourceGroupName, resourceName, configuration, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MaintenanceConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<MaintenanceConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MaintenanceConfigurationInner> clientResponse = updateMethodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MaintenanceConfigurationInner> updateMethodDelegate(Response<ResponseBody> response) throws MaintenanceErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MaintenanceConfigurationInner, MaintenanceErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MaintenanceConfigurationInner>() { }.getType())
                .registerError(MaintenanceErrorException.class)
                .build(response);
    }

    /**
     * Get Configuration records within a subscription.
     *
     * @return the PagedList<MaintenanceConfigurationInner> object if successful.
     */
    public PagedList<MaintenanceConfigurationInner> list() {
        PageImpl<MaintenanceConfigurationInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<MaintenanceConfigurationInner>(page) {
            @Override
            public Page<MaintenanceConfigurationInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Get Configuration records within a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MaintenanceConfigurationInner>> listAsync(final ServiceCallback<List<MaintenanceConfigurationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get Configuration records within a subscription.
     *
     * @return the observable to the List&lt;MaintenanceConfigurationInner&gt; object
     */
    public Observable<Page<MaintenanceConfigurationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<MaintenanceConfigurationInner>>, Page<MaintenanceConfigurationInner>>() {
            @Override
            public Page<MaintenanceConfigurationInner> call(ServiceResponse<List<MaintenanceConfigurationInner>> response) {
                PageImpl<MaintenanceConfigurationInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Get Configuration records within a subscription.
     *
     * @return the observable to the List&lt;MaintenanceConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<List<MaintenanceConfigurationInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MaintenanceConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MaintenanceConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MaintenanceConfigurationInner>> result = listDelegate(response);
                        List<MaintenanceConfigurationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MaintenanceConfigurationInner>> clientResponse = new ServiceResponse<List<MaintenanceConfigurationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MaintenanceConfigurationInner>> listDelegate(Response<ResponseBody> response) throws MaintenanceErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MaintenanceConfigurationInner>, MaintenanceErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MaintenanceConfigurationInner>>() { }.getType())
                .registerError(MaintenanceErrorException.class)
                .build(response);
    }

}
