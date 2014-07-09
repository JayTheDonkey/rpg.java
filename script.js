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
		"well, maybe this is a game",
		"no it's not!",
		"sure it is! it's part of a complex sociological experiment",
		"I wasn't led to believe it was that sort of game...",
		"oh, well then maybe this isn't a game",
		"well what is it?",
		"it's a filler site, since the game isn't actually finished yet",
		"then why are you WASTING MY TIME???",
		"'cause its amusing?",
		"well, can you at least tell me what sort of game it is?",
		"I thought you knew all about it already, and that was why you are here",
		"oh, right. it's a text-based game...",
		"so maybe this is a game then!",
		"...it's an RPG",
		"a what?",
		"a role playing game",
		"and here I am, playing the role of a sarcastic human, while in reality I'm just a server",
		"IT IS A FANTASY ADVENTURE GAME WHERE YOU FIGHT A DRAGON! THIS IS NOT IT! OK?",
		"so just because I'm a server means I can't have any fun? :(",
		"what idiot(s) spent time developing this shit?",
		"that would be Jackson Anderson and <a href='http://gabriel-damon.com' target='_blank'>Gabriel Damon</a>",
		"do they live in Santa Cruz?",
		"why do you want to know?",
		"so I can drive over to their houses and give them each a well deserved swift kick in the rear",
		"then, no. they don't live in Santa Cruz",
		"what sort of idiots do they think want to play a text based game?",
		"apparently you",
		"are they just bad programmers or something?",
		"no, they are just practicing OOP techniques",
		"What is OOP? because if you think I'm one of those crazy people who likes Alley Oop, you must be more idiotic than I thought",
		"no, it stands for <a href='http://en.wikipedia.org/wiki/Object-oriented_programming' target='_blank'>Object Oriented Programming</a>",
		"what language is it written in? BASIC?",
		"don't make me laugh. it's good old fashioned Java",
		"why am I still talking to you?",
		"don't ask me",
		"then I won't"
		];
	var i = 0;
	var showedLogo = false;
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
			$('html,body').animate({
				scrollTop: document.body.scrollHeight
				}, 1000);
			i++;
			}
		else if(!showedLogo) {
			$("<a href='https://github.com/JayTheDonkey/rpg.java' target='_blank' id='github'>View Project on Github</a>").insertAfter("div:last-child");
			showedLogo = true;
			window.scrollTo(0,document.body.scrollHeight);
			$('html,body').animate({
				scrollTop: document.body.scrollHeight
				}, 1000);
			}
		}, 2500);
	});
