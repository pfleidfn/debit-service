package contracts.debit

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/debit'
		body([
				customerId : "florian.pfleiderer",
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
				debitStatus : 'OK',
				rejectionReason : null,
				onBlacklist : false
		])
		headers {
			contentType(applicationJsonUtf8())
		}
	}

}
