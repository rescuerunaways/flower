**Algorithm**
Flower uses a clever dynamic programming algorithm, which
allows to calculate the set of minimum bundles to pack the
order in linear.
The design also allows for slight modifications to make
consecutive requests to packing service sublinear;

The algorithm handles the case when two or more options are
possible as equal, i.e. there are 2 ways to pack 4 flowers
into buckles [1,2,3] - the algorithm doesn't make difference
between [1,3] and [2,2] and returns the first found.

In case the order cannon be packed into bundles, the exception
is thrown and client is provided with the closest number
of flowers which can be packed.

**Java, Dependencies**
The project makes use of functional progamming,
so Java 8 is needed.
The dependencies are intentionally minimal,
but JUnit 4 is required.
