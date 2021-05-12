int findCelebrity (int n) {
	stack<int> s;
	int C;
	for (int i = 0; i < n; I++)
		s.push(i);
	int A = s.top();
	s.pop();
	int B = s.top();
	s.pop();
	
	while (s.size() > 1){
		 if(knows(A, B)) {
			A = s.top();
			 
		}
	}
}
