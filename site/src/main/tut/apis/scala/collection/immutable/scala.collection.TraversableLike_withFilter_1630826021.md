//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#withFilter(p:A=>Boolean):scala.collection.generic.FilterMonadic[A,Repr]">scala.collection.TraversableLike#withFilter</a></li>
<li name="scala.collection.TraversableLike#withFilter" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="withFilter(p:A=>Boolean):scala.collection.generic.FilterMonadic[A,Repr]"></a><a id="withFilter((A)⇒Boolean):FilterMonadic[A,List[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#withFilter(p:A=>Boolean):scala.collection.generic.FilterMonadic[A,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">withFilter</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: <a href="../generic/FilterMonadic.html" class="extype" name="scala.collection.generic.FilterMonadic">FilterMonadic</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>, <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]]</span> </span> <p class="shortcomment cmt">Creates a non-strict filter of this traversable collection.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Creates a non-strict filter of this traversable collection.</p>
   <p> Note: the difference between <code>c filter p</code> and <code>c withFilter p</code> is that the former creates a new collection, whereas the latter only restricts the domain of subsequent <code>map</code>, <code>flatMap</code>, <code>foreach</code>, and <code>withFilter</code> operations.</p>
   <p> Note: might return different results for different runs, unless the underlying collection type is ordered. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    p
   </dt>
   <dd class="cmt">
    <p>the predicate used to test elements.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>an object of class <code>WithFilter</code>, which supports <code>map</code>, <code>flatMap</code>, <code>foreach</code>, and <code>withFilter</code> operations. All these operations apply to those elements of this traversable collection which satisfy the predicate <code>p</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../generic/FilterMonadic.html" class="extype" name="scala.collection.generic.FilterMonadic">FilterMonadic</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



