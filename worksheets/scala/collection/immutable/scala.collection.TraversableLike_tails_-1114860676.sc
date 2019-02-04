//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#tails:Iterator[Repr]">scala.collection.TraversableLike#tails</a></li>
//<li name="scala.collection.TraversableLike#tails" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="tails:Iterator[Repr]"></a><a id="tails:Iterator[List[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#tails:Iterator[Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">tails</span><span class="result">: <a href="../Iterator.html" class="extype" name="scala.collection.Iterator">Iterator</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]]</span> </span> <p class="shortcomment cmt">Iterates over the tails of this traversable collection.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Iterates over the tails of this traversable collection. The first value will be this traversable collection and the final one will be an empty traversable collection, with the intervening values the results of successive applications of <code>tail</code>. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>an iterator over all the tails of this traversable collection</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p><code>List(1,2,3).tails = Iterator(List(1,2,3), List(2,3), List(3), Nil)</code></p></li>
//    </ol> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
