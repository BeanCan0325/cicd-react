import Child from "../components/08_Child.jsx";

function ListRendering() {
    return (
        <>
            <p>ListRednering 페이지 입니다.</p>
            <Child numbers={[1,2,3,4,5]}></Child>
        </>
    );
}

export default ListRendering;

