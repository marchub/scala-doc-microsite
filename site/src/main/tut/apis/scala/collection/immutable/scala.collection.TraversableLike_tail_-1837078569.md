//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#tail:Repr">scala.collection.TraversableLike#tail</a></li>
<li name="scala.collection.TraversableLike#tail" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="tail:Repr"></a><a id="tail:List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#tail:Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">tail</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Selects all elements except the first.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Selects all elements except the first.</p>
   <p> Note: might return different results for different runs, unless the underlying collection type is ordered.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a traversable collection consisting of all elements of this traversable collection except the first one.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
   <dt>
    Exceptions thrown
   </dt>
   <dd>
    <span class="cmt"><p><span class="extype" name="`UnsupportedOperationException`"><code>`UnsupportedOperationException`</code></span> if the traversable collection is empty.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



