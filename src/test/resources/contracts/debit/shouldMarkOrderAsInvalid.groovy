package contracts.debit

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/debit'
		body([
				customerId : "florian.pfleiderer",
				creditCardNumber : 123456,
				amount : 3.50
		])
		headers {
			contentType(applicationJsonUtf8())
		}
	}
	response {
		status 200
		body([
				debitStatus: 'INVALID',
				rejectionReason: 'Credit card number is invalid',
				onBlacklist: false
		])
		headers {
			contentType(applicationJsonUtf8())
		}
	}

}
