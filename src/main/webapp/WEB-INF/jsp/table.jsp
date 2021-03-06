<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Carousel Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <%--    <link href=<c:url value=static/css/bootstrap.css />" rel="stylesheet">--%>

    <!-- Custom styles for this template -->
    <%--    <spring:url value="/css/main.css" var="springCss" />--%>
    <spring:url value="/css/bootstrap.min.css" var="bootstrapmin" />
    <link href="${bootstrapmin}" rel="stylesheet" />

    <spring:url value="/css/carousel.css" var="carousel" />
    <link href="${carousel}" rel="stylesheet" />

    <spring:url value="/js/jquery-1.11.3.min.js" var="jquery" />
    <spring:url value="/js/bootstrap.js" var="bootstrapJs" />

    <%--    <c:url value="/css/carousel.css" var="carousel"/>--%>
    <%--    <link href="${carousel}" rel="stylesheet"/>--%>
    <%--    <link href="static/css/carousel.css" rel="stylesheet">--%>
</head>

<body>
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Project name</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="<c:url value="/" /> ">Home</a></li>
                        <li><a href="<c:url value="/table" />">Products</a></li>
                        <li><a href="#contact">Contact</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </div>
</div>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All Products</h1>

            <p class="lead">Checkout all the awesome products available now!</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo Thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th>Details</th>
            </tr>
            </thead>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td><img src="#" alt="image"/></td>
                    <td>${book.name}</td>
                    <td>${book.name}</td>
                    <td>${book.name}</td>
                    <td>tbd</td>
                    <td>
                        <c:url value="/book-view/${book.id}" var="bookView" />
                        <a href="${bookView}">
                        Details
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <!-- FOOTER -->
        <footer>
            <p class="pull-right"><a href="#">Back to top</a></p>

            <p>&copy; 2015 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
        </footer>
    </div>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src=${jquery}><\/script>')</script>
<script src=${bootstrapJs}></script>
</body>



</html>