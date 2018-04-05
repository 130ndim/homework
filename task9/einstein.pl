houses(Houses) :-
	%house(nationality, pet, cigarettes, drink, color)
	length(Houses, 5),
	member(house(english,_,_,_,red), Houses),
	member(house(spanish,dog,_,_,_), Houses),
	member(house(_,_,_,coffee,green), Houses),
	member(house(ukrainian,_,_,tea,_), Houses),
	next(house(_,_,_,_,green), house(_,_,_,_,white), Houses),
	member(house(_,snake,winston,_,_), Houses),
	member(house(_,_,kool,_,yellow), Houses),
	Houses = [_,_,house(_,_,_,milk,_),_,_],
	Houses = [house(norwegian,_,_,_,_)|_],
	next(house(_,fox,_,_,_), house(_,_,chesterfield,_,_), Houses),
	next(house(_,_,kool,_,_), house(_,horse,_,_,_), Houses),
	member(house(_,_,lucky,juice,_), Houses),
	member(house(japanese,_,kent,_,_), Houses),
	next(house(norwegian,_,_,_,_), house(_,_,_,_,blue), Houses),
	member(house(_,_,_,water,_), Houses),
	member(house(_,zebra,_,_,_), Houses),
	member(house(Owner,zebra,_,_,_), Houses),
    member(house(Drinker,_,_,water,_), Houses),
	write(Owner), print(' owns zebra'), nl,
    write(Drinker), print(' drinks water').

next(A, B, Ls) :- append(_, [A,B|_], Ls).
next(A, B, Ls) :- append(_, [B,A|_], Ls).


