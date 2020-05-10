<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/jsp/templates/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Here is the detail information of the product!</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100%; height: 300px" />
                </div>

                <div class="col-md-5">
                    <h3>${book.name}</h3>
                    <p>${book.isbn}</p>
                    <p>
                        <strong>Manufacturer</strong> : tbd
                    </p>
                    <p>
                        <strong>Category</strong> : tbd
                    </p>
                    <p>
                        <strong>Condition</strong> : tbd
                    </p>
                    <h4> USD</h4>
                </div>
            </div>
        </div>


        <%@include file="/WEB-INF/jsp/templates/footer.jsp"%>
