<!DOCTYPE html>
<%@ taglib prefix="regform" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <regform:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <regform:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Registration"
                </td>
            </tr>
        </table>
    </regform:form>
</body>
</html>