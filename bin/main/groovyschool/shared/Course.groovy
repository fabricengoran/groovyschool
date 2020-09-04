package groovyschool.shared

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Course implements Serializable {

    private static final long serialVersionUID = 1

    String title
    String author
    String subTitle
    String image_url
    String description
    Date datePublished
    String status = "draft" //draft, published, archived 

    static constraints = {
        title nullable: false, blank: false, unique: true
        author nullable: false, blank: false
    }

}