class User {
    String fullName
    String email
    String subject
    String message

    static constraints = {
        fullName blank: false, unique: true, matches:"[a-zA-Z1-9_]+"
        email blank: false, unique: true, matches:"[a-zA-Z1-9_]+@"
        subject nullable: false
        message blank: false
    }
}