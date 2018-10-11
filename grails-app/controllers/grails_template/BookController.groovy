package grails_template
class BookController {
	static defaultAction = "list"

	def list() {
	//	[books: Book.list(params)]
	}

	def show() {
		[book: Book.get(params.id)]
	}
}
