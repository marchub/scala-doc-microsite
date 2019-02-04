//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#init:Repr">scala.collection.TraversableLike#init</a></li>
<li name="scala.collection.TraversableLike#init" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="init:Repr"></a><a id="init:List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#init:Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">init</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Selects all elements except the last.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Selects all elements except the last.</p>
   <p> Note: might return different results for different runs, unless the underlying collection type is ordered.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a traversable collection consisting of all elements of this traversable collection except the last one.</p>
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
    <span class="cmt"><p><a href="../../index.html#UnsupportedOperationException=UnsupportedOperationException" class="extmbr" name="scala.UnsupportedOperationException"><code>UnsupportedOperationException</code></a> if the traversable collection is empty.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



