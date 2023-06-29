# Spring Security

This project is a demonstration of utilizing OAuth2 with Google. It is implemented in Spring Security 6, leveraging
OAuth2Login, OAuth2Client, and OAuth2ResourceService for testing authorization, authentication, permissions, and roles.

## OAuth2 Google Console Configuration

### Create project

- https://console.cloud.google.com/

### Add Service Indentity Platfom

- Add provideer by email/password
- Add User

### Config Apis & services

- Credentials - Add OAuth 2.0
- Config Consent page (not necessary publish your project)
- Config redirect_uri

```
http://localhost:8080/login/oauth2/code/google
```

- Get credentials clientId and clientSecret
- Modify outh2-client-demo application.yml

## Usage

You can use index.html to test permissions, roles and resource server call.

```
http://localhost:8080/index.html
```

If you are not authorized, you will be redirect

```
http://localhost:8080/login.html
```

If you want to logout

```
http://localhost:8080/logout.html
```

### Swagger

```
http://localhost:8080/swagger-ui/index.html
```