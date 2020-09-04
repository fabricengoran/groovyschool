<!doctype html>
<html lang="en">
<head>
<meta name="layout" content="page"/>
	<title>Contact Us - Groovy School</title>
</head>
<body>
<g:render template="/page/shared/nav"/>
<main class="contact-us">
<div class="wrapper">
    <div class="main">
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2 text-center">
                        <h2 class="title">Get in touch with us</h2>
                        <p>Welcome to our contact us page here you can reach the administrators with whatever worries, questions or suggestions you have .</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-md-offset-3 text-center">
                        <h3><small>Find us on social networks</small></h3>

                        <button class="btn btn-icon btn-fill btn-twitter">
                            <i class="fa fa-twitter"></i>
                        </button>

                        <button class="btn btn-icon btn-fill btn-facebook">
                            <i class="fa fa-facebook"> </i>
                        </button>

                        <button class="btn btn-icon btn-fill btn-google">
                            <i class="fa fa-google"> </i>
                        </button>

                        </button>

                        <button class="btn btn-icon btn-fill btn-instagram">
                            <i class="fa fa-instagram"></i>
                        </button>
                        <button class="btn btn-icon btn-fill btn-youtube">
                            <i class="fa fa-youtube"></i>
                        </button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-md-offset-3 text-center">
                        <h3><small>Or drop us a note</small></h3>

                        <g:form class="contact" controller = "contact" action = "save">
                            <div class="row">
                                <div class="col-md-12">
                                    <g:textField class= "form-control" id="${User.name}" name="fullName" placeholder="Full Name"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <g:textField class= "form-control" id="${User.name}" name="email" placeholder="Email"/>
                                </div>
                                <div class="col-md-6">
                                    <g:textField class= "form-control" id="${User.name}" name="subject" placeholder="Subject"/>
                                </div>
                            </div>
                            <g:textArea class= "form-control" id="${User.name}" name="message" placeholder="Message"/>
                            <div class="row">
                                <div class="col-md-4 col-md-offset-4">
                                    <g:actionSubmit class="btn btn-primary btn-fill btn-block" value="send" action="update"/>
                                </div>
                            </div>
                        </g:form>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</main>
    <g:render template="/page/shared/footer"/>
</body>
</html>
