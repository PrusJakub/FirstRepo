trigger RestrictContactByName on Contact (before insert, before update) {
	
	private static final String invalidName = 'INVALIDNAME';
	for (Contact c : Trigger.New) {
		if(c.LastName == invalidName) {	//invalidname is invalid
			c.AddError('The Last Name "'+c.LastName+'" is not allowed for DML');
		}

	}



}