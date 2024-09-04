package sk.train;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class EmployeeExceptionMapper implements ExceptionMapper<EmployeeException> {


    @Override
    public Response toResponse(EmployeeException exception) {
        return Response.status(Response.Status.CONFLICT).entity(new RestError(exception.getMessage(), 1)).build();
    }
}
