//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#sorted[B>:A](implicitord:scala.math.Ordering[B]):Repr">scala.collection.SeqLike#sorted</a></li>
<li name="scala.collection.SeqLike#sorted" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sorted[B>:A](implicitord:scala.math.Ordering[B]):Repr"></a><a id="sorted[B>:A](math.Ordering[B]):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#sorted[B>:A](implicitord:scala.math.Ordering[B]):Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sorted</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span class="implicit">implicit </span><span name="ord">ord: <a href="../../math/Ordering.html" class="extype" name="scala.math.Ordering">math.Ordering</a>[<span class="extype" name="scala.collection.SeqLike.sorted.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Sorts this sequence according to an Ordering.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Sorts this sequence according to an Ordering.</p>
   <p> The sort is stable. That is, elements that are equal (as determined by <code>lt</code>) appear in the same order in the sorted sequence as in the original. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    ord
   </dt>
   <dd class="cmt">
    <p>the ordering to be used to compare elements.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a sequence consisting of the elements of this sequence sorted according to the ordering <code>ord</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
   </dd>
   <dt>
    See also
   </dt>
   <dd>
    <span class="cmt"><p><a href="../../math/Ordering.html" class="extype" name="scala.math.Ordering">scala.math.Ordering</a></p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples





```tut
List(4,1,3,2).sorted
```

```tut
List("d","b","c","a").sorted
```

```tut
List(
  (4,"a"),
  (1,"b"),
  (3,"c"),
  (2,"d")
).sorted
```

```tut
List(
  (1,"b"),
  (1,"c"),
  (1,"a")
).sorted
```

```tut
List("c","a","b").sorted
```

TODO reverse order
//TODO Ordering

















