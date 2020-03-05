package org.biotestmine.web;

/*
 * Copyright (C) 2002-2017 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */



import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import org.intermine.web.struts.InterMineAction;


public class ChartRenderer extends InterMineAction
{
    private static final Logger LOG = Logger.getLogger(ChartRenderer.class);
    private static final Class[] SIG = new Class[] {ActionMapping.class, ActionForm.class,
        HttpServletRequest.class, HttpServletResponse.class};
    private final double logE2 = Math.log(2.0);

    /**
     * First, check for a cached image, otherwise defer to appropriate method.
     *
     * @param mapping The ActionMapping used to select this instance
     * @param form The optional ActionForm bean for this request (if any)
     * @param request The HTTP request we are processing
     * @param response The HTTP response we are creating
     * @return an ActionForward object defining where control goes next
     * @exception Exception if the application business logic throws
     *  an exception
     */
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
        throws Exception {
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String method = request.getParameter("method");
        System.out.println("ChartRenderer");
        System.out.println("method is:" + method);
        return null;
    }
}
