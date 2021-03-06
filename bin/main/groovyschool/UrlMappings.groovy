package groovyschool

class UrlMappings {

    static mappings = {

        "/"(view:"/page/home")
        "/login/auth"(view:"/page/login")

        "/page/home"(view:"/page/home")
        "/page/register"(view:'/page/register')
        "/page/login"(view:"/page/login")
        "/page/catalog"(view:"/page/catalog")
        "/page/about"(view:"/page/about")
        "/page/contact"(view:"/page/contact")
        "/page/course"(view:"/page/course")

        get "/admin/dashboard" (controller: "/admin/dashboard", action: "index")

        "500"(view:'/page/error')
        "403"(view:'/login/auth')
        "404"(view:'/page/notFound')
    }
}
