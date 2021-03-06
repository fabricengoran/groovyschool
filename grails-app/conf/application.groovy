// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'groovyschool.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'groovyschool.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'groovyschool.auth.Role'
grails.plugin.springsecurity.useBasicAuth = true
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/page/**',        access: ['permitAll']],
	[pattern: '/admin/**',       access: ['ROLE_ADMIN']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/admin/dashboard'
grails.plugin.springsecurity.userLookup.usernamePropertyName='email'
grails.plugin.springsecurity.logout.afterLogoutUrl = "/"

