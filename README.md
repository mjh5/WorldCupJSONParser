# WorldCupJSONParser
### Parses World Cup JSON data from football.db into a hierarchy of Java Objects using Google's Gson library.

The object hierarchy models the structure of the JSON data, consisting of a WorldCup object. This contains an array of 
Round objects. Each Round has an array of Match object, which contain a information on each individual match.
Subclasses within Match include Team, Goal, and Stadium. Additional methods are provided in Match to calculate and return
additional data. Full documentation can be found in the Javadoc folder inside the java directory.
