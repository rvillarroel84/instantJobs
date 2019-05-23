package com.rvillarroel.instantjob.rest;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.rvillarroel.instantjob.model.Specialist;
import com.rvillarroel.instantjob.repository.SpecialistRepository;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.net.URI;
import java.util.List;

@Path("/specialist")
public class SpecialistEndpoint {

	
    // ======================================
    // =          Injection Points          =
    // ======================================	
	@Inject 
	private SpecialistRepository specialistRepository;

	
    // ======================================
    // =          Business methods          =
    // ======================================	
	
	/**
	 * @param id
	 * @return
	 * @see com.rvillarroel.instantjob.repository.SpecialistRepository#find(java.lang.Long)
	 */
	@GET
	@Path("/{id: \\d+}")
	@Produces(APPLICATION_JSON)
	public Response getSpecialist(@PathParam("id") @Min(1) Long id) {
		
		Specialist specialist = specialistRepository.find(id);;
		
		if (specialist == null)
			Response.status(Response.Status.NOT_FOUND).build();
				
		return Response.ok(specialist).build();
	}


	/**
	 * @param specialist
	 * @return
	 * @see com.rvillarroel.instantjob.repository.SpecialistRepository#create(com.rvillarroel.instantjob.model.Specialist)
	 */
	@POST
	@Consumes(APPLICATION_JSON)
	public Response createSpecialist(Specialist specialist, @Context UriInfo uriInfo) {
		specialist = specialistRepository.create(specialist);
	    URI createdURI = uriInfo.getAbsolutePathBuilder().path(specialist.getId().toString()).build();
	    return Response.created(createdURI).build();
	}


	/**
	 * @param id
	 * @see com.rvillarroel.instantjob.repository.SpecialistRepository#delete(java.lang.Long)
	 */
    @DELETE
    @Path("/{id : \\d+}")	
	public Response deleteSpecialist(@PathParam("id") @Min(1) Long id) {
		specialistRepository.delete(id);
		return Response.noContent().build();
	}


	/**
	 * @return
	 * @see com.rvillarroel.instantjob.repository.SpecialistRepository#findAll()
	 */
    
    @GET
    @Produces(APPLICATION_JSON)
	public Response getSpecialists() {
    	
    	List<Specialist> specialists = specialistRepository.findAll();
		
    	if(specialists.size() == 0)
			Response.status(Response.Status.NO_CONTENT).build();
		
    	return Response.ok(specialists).build();
	}
	
	
	
	

	
	
	
	
}
