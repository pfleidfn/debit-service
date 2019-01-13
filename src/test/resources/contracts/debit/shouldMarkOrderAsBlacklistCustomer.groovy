package contracts.debit

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/debit'
		body([
				customerId : 'max.mustermann',
				creditCardNumber : 1234567890123456,
				amount : 3.50
		])
		headers {
			contentType(applicationJsonUtf8())
		}
	}
	response {
		status 200
		body([
				debitStatus    : 'INVALID',
				rejectionReason: 'Customer is on Blacklist',
				onBlacklist    : true
		])
		headers {
			contentType(applicationJsonUtf8())
		}
	}

}
