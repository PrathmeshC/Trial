package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import model.Request;
import model.Response;

public class Main implements RequestHandler<Request, Response> {

	public Response handleRequest(Request arg0, Context arg1) {
		String s="Hello"+arg0.getmFname()+" "+arg0.getmLname();
		Response res=new Response();
		res.setmResp(s);
		return res;
	}
	

}
