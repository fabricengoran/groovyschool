class ContactController {
    def show = {
        def contact = User.get(params.id)
        [contact: contact]
    }

    def update = {
        def contact = User.get(params.id)
        contact.properties = params
        contact.save flush: true, failOnError: true
        redirect action: "show", id: params.id
    }
}