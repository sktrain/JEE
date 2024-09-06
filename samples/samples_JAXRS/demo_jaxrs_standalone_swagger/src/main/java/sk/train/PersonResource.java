/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sk.train;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Tag(name = "OpenAPI Example", description = "Get a Person-Object in XML or JSON format")
@Path("/")
public class PersonResource {
    @Inject
    Person p;

    @Operation(description = "Getting Person as JSON")
    @APIResponse(responseCode = "200", description = "Successful, JSON")
    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public Person getHelloWorldJSON() {
        return p;
    }

    @Operation(description = "Getting Person as XML")
    @APIResponse(responseCode = "200", description = "Successful, XML")
    @GET
    @Path("/xml")
    @Produces({ "application/xml" })
    public Person getHelloWorldXML() {
        return p;
    }

}
