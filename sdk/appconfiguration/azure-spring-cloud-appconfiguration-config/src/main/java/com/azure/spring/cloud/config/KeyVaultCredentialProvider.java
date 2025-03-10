// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config;

import com.azure.core.credential.TokenCredential;

public interface KeyVaultCredentialProvider {

    TokenCredential getKeyVaultCredential(String uri);

}
