I used H2 database as it was faster, but alternatively I could have used Postgres so that I could take advantage of jsonb data type for some of nested data under Poll object
(for example instead of Options there would be a jsonb field, and in Participant object instead of doing transformations between string and list, preferences could have been stored in josnb field).

The 3 needed end points have following paths: 
1. /user/{email}/polls - for fetching all the polls for a given user
2. /polls/title/{title} - for fetching all polls for given title
3. /polls/date/{date} - for fetching all polls that were initiated after given date, date parameter should be in a following format: YYYY-MM-DD