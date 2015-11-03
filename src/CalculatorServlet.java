
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import Kivun.Infra.DTO.DTOJSONConverter;
import Kivun.Infra.DTO.ServiceMessage;

import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServicesFactory;
import Kivun.Infra.Services.ServicesFactory;
import Calculator.Services.AddService;
import Calculator.Services.IAddService;

public class CalculatorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private IServicesFactory _servicesFactory;
	
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("=====>>>>>Init Calculator");
		_servicesFactory = 		ServicesFactory.Instance();
		super.init(servletConfig);
		Enumeration<String> servicesNames = servletConfig.getInitParameterNames();
		while (servicesNames.hasMoreElements()){
			String serviceName = servicesNames.nextElement();
			try {
				Class<?> iserviceClass = Class.forName(serviceName);
				Class<?> serviceClass = Class.forName(servletConfig.getInitParameter(serviceName));
				_servicesFactory.RegisterClass(iserviceClass,(IService)serviceClass.newInstance());
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In here GET");
		try {
			PrintWriter out = response.getWriter();
			out.println("This is get");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In here POST");
		HandleRequest(request, response);
	}

	private void HandleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String msgParams = request.getParameter("ServiceMessage");
		ServiceMessage serviceMessage = new ServiceMessage(msgParams);
		IService service = _servicesFactory.createService(
				serviceMessage.get_Handler());
		DTOJSONConverter converter = new DTOJSONConverter();
		IDTO dto = null;
		try {
			dto = converter.ToDTO(new JSONObject(serviceMessage.get_DTO()));
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		service.set_Params(dto);
		service.Execute();
		try {
			PrintWriter out = response.getWriter();
			out.println("Hello to you all");
			out.println(service.get_Response());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
