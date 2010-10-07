<%@tag import="java.util.logging.Level"%>
<%@tag import="java.util.logging.Logger"%>
<%@tag language="java" pageEncoding="ISO-8859-1" description="Log message from JSP Page" body-content="empty"%>
<%@attribute name="msg" required="true"  description="Message to log"%>
<%@attribute name="level" required="false"  description="log level for this message (info*|warn|debug|err)"%>
<%@attribute name="logger" required="false"  description="Name of the logger. Default: PageName"%>
<%
//Normalizing the input attributes
if (msg == null || msg.trim().equals(""))
	msg="[No Message]";


String loggerName = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/"));
if(logger != null && !logger.trim().equals(""))
	loggerName = logger;
if(level == "")
	level = "DEBUG";
else
	level = level.toUpperCase();

Logger l = Logger.getLogger(logger);
if(level.equals("DEBUG"))
	l.fine(msg);
else if (level.startsWith("INFO"))
	l.info(msg);
else if (level.startsWith("WARN"))
	l.warning(msg);
else if (level.startsWith("ERR"))
	l.severe(msg);
else
	l.log(Level.ALL, msg);

%>