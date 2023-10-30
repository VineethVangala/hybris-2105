CX Core 
B2C & B2B Accelerators with OMS (formerly b2c_b2b_acc_oms). For Kyma integration + ApiRegistry, event sending is turned off by default by apiregistryservices.events.exporting=false property. Optionally and before initialization, deployment.api.endpoint property should be set to a server url reachable by kyma instead of https://localhost:9002.
 Platform Setup:
   1. Setup platform using command ./install.sh -r cx setup -A initAdminPassword=[password]
   2. Initialize platform using command ./install.sh -r cx initialize -A initAdminPassword=[password]
   3. Start platform using command ./install.sh -r cx start


Import OCC credentials
INSERT_UPDATE OAuthClientDetails;clientId[unique=true]    ;resourceIds       ;scope        ;authorizedGrantTypes                                            ;authorities             ;clientSecret    ;registeredRedirectUri
                                ;client-side              ;hybris            ;basic        ;implicit,client_credentials                                     ;ROLE_CLIENT             ;secret          ;http://localhost:9001/authorizationserver/oauth2_implicit_callback;
                                ;mobile_android           ;hybris            ;basic        ;authorization_code,refresh_token,password,client_credentials    ;ROLE_CLIENT             ;secret          ;http://localhost:9001/authorizationserver/oauth2_callback;