<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
</head>
<body>
<h1><bean:write name="helloWorldForm" property="message" />
<div>JSTL object value: ${foo}</div>
</h1>
</body>
</html>