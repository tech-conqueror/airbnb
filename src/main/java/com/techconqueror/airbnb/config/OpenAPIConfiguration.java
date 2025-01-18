package com.techconqueror.airbnb.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info =
                @Info(
                        title = "Airbnb API",
                        description =
                                "This API provides endpoints for managing reservations, hotels, rooms, and users within the Airbnb system.",
                        contact =
                                @Contact(
                                        name = "Tech Conqueror Support",
                                        url = "https://www.techconqueror.com",
                                        email = "mannm.engineer@gmail.com"),
                        license = @License(name = "MIT License", url = "https://opensource.org/licenses/MIT")),
        servers = @Server(url = "http://localhost:8080", description = "Local development server"))
class OpenAPIConfiguration {}
