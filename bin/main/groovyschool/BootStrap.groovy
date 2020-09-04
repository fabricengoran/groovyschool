package groovyschool

import grails.util.Environment
import groovyschool.auth.*

class BootStrap {

    def init = { servletContext ->
        if(Environment.current == Environment.DEVELOPMENT) { 
            createDevUsers()
        }

        User contact = new User(fullName:'gr8di admin', email:'admin@gr8di.com', subject:'This is a subject', message:'This is a message')
                if (!contact.save()){
                    log.error "Could not send request!"
                    log.error "${contact.errors}"
                }
    }

    def createDevUsers() { 
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(failOnError:true)
        def admin = new User(email: "admin@gr8di.com", password: 'password').save(failOnError:true)
        new UserRole(user: admin, role: adminRole).save(failOnError:true)
    }

    def destroy = {
    }
}
