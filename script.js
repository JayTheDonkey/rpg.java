$(document).ready(function() {
	var conversation = [
		"hi!",
		"shouldn't there be something here?",
		"I am",
		"I meant a website sort of thing",
		"well, what are you looking at right now?",
		"oh",
		"can I help you?",
		"I was led to believe this was the homepage for a game",
		"Well, maybe this is a game.",
		"No its not!",
		"Sure it is! Its part of a complex sociological experiment",
		"I wasn't led to believe it was that sort of game...",
		"Oh, well then maybe this isn't a game",
		"Well what is it?",
		"Its a filler site, since the game isn't actually finished yet?",
		"Then why are you WASTING MY TIME???",
		"'cause its amusing?",
		"Well, can you at least tell me what sort of game it is?",
		"I thought you knew all about it already, and that was why you are here.",
		"Oh right. Its a text-based game...",
		"So maybe this is the game then!",
		"...its an RPG",
		"a what?",
		"a role playing game",
		"and here I am, playing a role of a sarcastic human, while in reality I'm just a server",
		"IT IS A FANTASY ADVENTURE GAME WHERE YOU FIGHT A DRAGON! THIS IS NOT IT! OK?",
		"so just because I'm a server means I can't have any fun? :(",
		"So what idiot(s) spent time developing this shit?",
		"That would be Jackson Anderson and <a href='http://gabriel-damon.com'>Gabriel Damon</a>.",
		"Do they live in Santa Cruz?",
		"Why do you want to know?",
		"So I can drive over to their houses and give them each a well deserved swift kick in the rear",
		"Then no. They don't live in Santa Cruz.",
		"what sort of idiots do they think want to play a text based game?",
		"apparently you",
		"are they just bad programmers or something?",
		"no, they are just practicing OOP techniques",
		"What is OOP? Because if you think I'm one of those crazy people who likes Ally Oop, you must be more idiotic than I thought",
		"No, it stands for <a href='http://en.wikipedia.org/wiki/Object-oriented_programming'>Object Oriented Programming</a>",
		"what language is it written in? BASIC?",
		"Don't make me laugh. Its good old fashioned C++",
		"Why am I still talking to you?",
		"Don't ask me",
		"then I won't"
		];
	var i = 0;
	setInterval(function() {
		if(i < conversation.length) {
			var element = "<div class='";
			if(i % 2 == 1) {
				element += "human";
				}
			else {
				element += "server";
				}
			element += "'>" + conversation[i] + "</div>";
			$(element).insertAfter("div:last-child");
			window.scrollTo(0,document.body.scrollHeight);
			i++;
			}
		}, 3000);
	});