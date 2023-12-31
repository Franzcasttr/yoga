<%-- 
    Document   : Footer
    Created on : 26 Jul, 2023, 5:09:25 PM
    Author     : nandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <footer class="site-footer bg-img-fix footer-action" style="background-image: url(img/logo/1.png);" id="footer">
		<div class="footer-top">
            <div class="container">
				<div class="row">
					<div class="col-xl-4 col-lg-5 order-2 order-lg-0">
						<div class="widget widget_about  text-start">
							<h5 class="footer-title wow fadeInUp" data-wow-delay="0.2s">Join Our Mailing List</h5>
							<form class="dzSubscribe dz-subscribe-wrapper1 wow fadeInUp" data-wow-delay="0.4s" action="assets/script/mailchamp.php" method="post">
								<div class="dzSubscribeMsg"></div>
								<div class="form-group">
									<div class="input-group mb-0"> 
										<input name="dzEmail" required="required" type="email" class="form-control" placeholder="Email Address">
										<div class="input-group-addon ">
											<button name="submit" value="Submit" type="submit" class="mail-sent">
												<i class="flaticon-sent"></i>
											</button>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
					<div class="col-xl-4 col-lg-2">
						<div class="footer-logo logo-center">
							<a href="Home"><img src="img/logo/1.png" alt="logo"></a>
						</div>
					</div>
					<div class="col-xl-4 col-lg-5 text-end">
						<div class="widget widget_locations">
							<h5 class="footer-title wow fadeInUp" data-wow-delay="0.2s">Stay Connected</h5>
							<div class="dz-social-icon icon-gap-5 wow fadeInUp" data-wow-delay="0.4s">
								<ul>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://www.facebook.com/">
										<i class="fab fa-facebook-f"></i>
									</a></li>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://www.instagram.com/">
										<i class="fab fa-instagram"></i>
									</a></li>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://twitter.com/">	
										<i class="fab fa-twitter"></i>
									</a></li>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://whatsapp.com/">
										<i class="fa-brands fa-whatsapp"></i>
									</a></li>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://www.linkedin.com/">
										<i class="fa-brands fa-linkedin-in"></i>
									</a></li>
									<li><a target="_blank" class="btn-social btn-transparent btn-circle" href="https://www.behance.net/">
										<i class="fa-brands fa-behance"></i>
									</a></li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-xl-12 wow fadeInUp" data-wow-delay="0.6s">
						<div class="footer-menu">
							<ul class="">
								<li><a href="index.html">HOME</a></li>
								<li><a href="services.html">ABOUT US</a></li>
								<li><a href="events.html">ACCOMMODATION & FOOD</a></li>
								<li><a href="course.html">CLASSES</a></li>
								<li><a href="personal-training.html">TRAINING</a></li>
								<li><a href="portfolio.html">GALLERY</a></li>
								
							</ul>
						</div>
					</div>
				</div>
            </div>
        </div>
        <!-- Footer Bottom Part -->
        <div class="container">
        	<div class="footer-bottom">
				<div class="row">
					<div class="col-xl-6 col-lg-6">
						<span class="copyright-text">Copyright © 2023 <a href="https://themeforest.net/user/hugebinary/" target="_blank">HugeBinary</a>. All rights reserved.</span>
					</div>
					<div class="col-xl-6 col-lg-6">
						<ul class="footer-link">
							<li><a href="privacy-policy.html">Privacy Notice</a></li>
							<li><a href="about-us.html">About</a></li>
							<li><a href="term-condition.html">Terms & Conditions</a></li>
						</ul>
					</div>
				</div>
            </div>
        </div>
	</footer>
    </body>
</html>
