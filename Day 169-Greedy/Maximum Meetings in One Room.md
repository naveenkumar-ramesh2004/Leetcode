## [Maximum Meetings in One Room](https://www.geeksforgeeks.org/problems/maximum-meetings-in-one-room/1)

```
class MeetingTime {
	int start;
	int end;
	int index;
	MeetingTime(int start, int end, int index) {
		this.start = start;
		this.end = end;
		this.index = index;
	}
}

class Solution {
	public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
		// code here
		MeetingTime[] meetingtimes = new MeetingTime[s.length];
		for (int i = 0; i<s.length; i++) {
			MeetingTime temp = new MeetingTime(s[i], f[i], i + 1);
			meetingtimes[i] = temp;
		}
		
		Arrays.sort(meetingtimes,(a,b)->{
		    if(a.end==b.end) return a.index-b.index;
		    return a.end-b.end;
		});
		
		int prevend=-1;
		ArrayList<Integer> ans = new ArrayList<>();
		for(MeetingTime meeting:meetingtimes){
		    if(meeting.start>prevend){
		        ans.add(meeting.index);
		        prevend=meeting.end;
		    }
		}
		
		Collections.sort(ans);
		return ans;
		
	}
}
