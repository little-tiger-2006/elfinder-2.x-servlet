package org.grapheco.web.servlet;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.grapheco.elfinder.controller.ConnectorController;
import org.grapheco.elfinder.controller.executor.CommandExecutorFactory;
import org.grapheco.elfinder.controller.executor.DefaultCommandExecutorFactory;
import org.grapheco.elfinder.controller.executors.MissingCommandExecutor;
import org.grapheco.elfinder.impl.DefaultFsService;
import org.grapheco.elfinder.impl.DefaultFsServiceConfig;
import org.grapheco.elfinder.impl.FsSecurityCheckForAll;
import org.grapheco.elfinder.impl.StaticFsServiceFactory;
import org.grapheco.elfinder.localfs.LocalFsVolume;
import org.springframework.context.annotation.Bean;

/**
 * ConnectorServlet is an example servlet it creates a ConnectorController on
 * init() and use it to handle requests on doGet()/doPost()
 * 
 * users should extend from this servlet and customize required protected
 * methods
 * 
 * @author bluejoe
 *
 */
@WebServlet(urlPatterns = "/userfiles-servlet/*", loadOnStartup = 1)
public class ElfinderConnectorServlet extends HttpServlet {
	// core member of this Servlet
	@Resource
	ConnectorController _connectorController;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		_connectorController.connector(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		_connectorController.connector(req, resp);
	}

}
